Optional<String> value = this.getOptionalValue();

// ...

if (value.isPresent()) {
  String stringValue = value.get();
}
