protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
  String input = req.getParameter("input");

  // Input validtion is verified
  if (!whiteList.contains(input))
    throw new IOException();
  ScriptEngineManager manager = new ScriptEngineManager();
  ScriptEngine engine = manager.getEngineByName("JavaScript");
  engine.eval(input);
}
