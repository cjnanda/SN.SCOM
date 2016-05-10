function Invoke-SCOMInitialize {
param(
		 $Path
	)
	$ErrorActionPreference = 'stop';
	try{
		
		$libs = @("Microsoft.EnterpriseManagement.Core.dll",
		"Microsoft.EnterpriseManagement.OperationsManager.dll", 
		"Microsoft.EnterpriseManagement.Runtime.dll" );
		$scriptpath =  Split-Path -Path $Path
		$adminui = $(Join-Path -Path $scriptpath -ChildPath 'lib');
		$libs | %{
		$(Join-Path -Path $adminui -ChildPath $_)
			$configmgrprov = get-item -Path $(Join-Path -Path $adminui -ChildPath $_)
			
			Add-Type -path $configmgrprov
		}
	}catch {
        $_.Exception.Message
		return $false;
	}
	
	return $true;
}