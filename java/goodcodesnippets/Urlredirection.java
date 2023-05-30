protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
String location = req.getparameter("url");

// Match the incoming URL against a whitelist
if (!urlWhiteList.contains(location))
throw new IOException();

resp.sendRedirect(location);
}
