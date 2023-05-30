KeyGenerator keyGen = KeyGenerator.getInstance("Blowfish");
keyGen.init(128);

KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
keyPairGen.initialize(2048);
