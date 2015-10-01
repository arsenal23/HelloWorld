Map params = new HashMap();
	Enumeration enumeration = request.getParameterNames();
	while (enumeration.hasMoreElements()) {
		String key = (String) enumeration.nextElement();
		String value = request.getParameter(key);
		logger.info("[" + request.getServletPath() + "] BBLResponse : Key = " + key + ", Value = " + value);
		params.put(key, value);
	}
