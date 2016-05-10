package com.sntoolkit.scom;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;

import com.glide.util.ParamString;
import com.service_now.mid.probe.Powershell;

public class PowershellRunner {
	 protected ParamString fCommandParam;
	 protected ParamString fScriptParam;
	 Map<String,String> fParameters;
	 public PowershellRunner(Map<String,String> parameters){
		 fParameters = parameters;
	 }
	 
	 public void runPowershell(){
			Powershell ps = new Powershell(fParameters);
		}
	 
	 
	 
	  
}
