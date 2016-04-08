package com.sntoolkit.scom;

import com.glide.util.ParamString;

public class PowershellRunner {
	 protected ParamString fCommandParam;
	 protected ParamString fScriptParam;
	 
	 
//	 protected String getCommand(File file, List<String> envVars)
//	  {
//	    return getCommand(file, "", "", envVars);
//	  }
//	  
//	  protected String getCommand(File file, String user, String password, List<String> envVars)
//	  {
//	    this.fCommandParam.setParameter("powershell", getPowershellExe());
//	    this.fCommandParam.setParameter("psscript", wrapParam(PSSCRIPTFILE));
//	    this.fCommandParam.setParameter("computer", getComputer());
//	    if (this.fCommandParameterPassing)
//	    {
//	      this.fCommandParam.setParameter("user", getUser(user));
//	      this.fCommandParam.setParameter("password", getPassword(password));
//	    }
//	    this.fCommandParam.setParameter("usecred", StringUtil.notNil(user) ? USE_CREDENTIALS : NO_CREDENTIALS);
//	    this.fCommandParam.setParameter("debug", isDebugging() ? DEBUG_TRUE : DEBUG_FALSE);
//	    
//	    this.fScriptParam.setParameter("script", wrapParam(file.getAbsolutePath()));
//	    this.fCommandParam.setParameter("userscript", this.fScriptParam.toString());
//	    
//	    this.fCommandParam.setParameter("isdisco", hasParameter("workflow") ? IS_RUNBOOK : IS_DISCOVERY);
//	    
//	    List list = new ArrayList();
//	    if (addScriptParameters(list, envVars) != 0) {
//	      return null;
//	    }
//	    this.fCommandParam.setParameter("genericparams", list.size() > 0 ? StringUtil.join(list, " ") : "");
//	    
//	    return this.fCommandParam.toString();
//	  }
	  
}
