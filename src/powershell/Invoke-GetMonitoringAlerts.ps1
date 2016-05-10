cls
& .\Invoke-SCOMInitialize.ps1


 #this call will invoke the command to load the DLL's into memory in order for us to use them in this powershell session
 Invoke-SCOMInitialize "Z:\projects\scom_updater\lib"

$ConnectorID = "{BCF258E0-2514-4EA5-ABF7-98A8CB208F3A}"
#$alertId = "BCF258E0-2514-4EA5-ABF7-98A8CB208F3A";
$alertId = $env:SNC_alertId;
$scomServerIP = "10.1.10.1";
#$scomServerIp = $enc:SNC_scomServerIp;
$scomServerUsername = "tester";
#$scomServerUsername = $enc:SNC_scomServerUsername;
$scomServerPassword = "passs";
#$scomServerPassword = $enc:SNC_scomServerPassword;
$alertGuid = new-object System.Guid($alertId)
$comment = "";
$guid = new-object System.Guid($ConnectorID);

$settings = new-object Microsoft.EnterpriseManagement.ManagementGroupConnectionSettings($scomServerIP);
$settings.UserName =$scomServerUsername;
$Password = $scomServerPassword | ConvertTo-SecureString -AsPlainText -Force
$settings.Password = $Password
$mg = [Microsoft.EnterpriseManagement.ManagementGroup]::Connect($settings);
$framework = $mg.ConnectorFramework.GetConnectorFramework();
$connector = $framework.GetConnector($guid);
$alert = $mg.OperationalData.GetMonitoringAlert($alertGuid);

#Update the alert
$alert.Update($comment, $connector);

#Close the alert
$alert.Refresh();
$alert.ResolutionState = 0xff;
$alert.Update($comment, $connector);