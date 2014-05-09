package reilaender.cipher;

/**
 * @author Manuel Reiländer (nur nachgeschrieben)
 */
public abstract class MonoalphabeticCipher implements Cipher {

	/** Standard Alphabet: abcdefghijklmnopqrstuvwxyz */
	public static final char[] STANDARD_ALPHABET = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private char[] secretAlphabet;
	protected MonoalphabeticCipher() {}
	@Override
	public String encrypt(String text) {
		return "encrypt() in MonoalphabeticCipher";
	}

	@Override
	public String decrypt(String text) {
		return "decrypt() in Monoalphabetic";
	}
	/**
	 * Erklärt sich von selbst
	 * @param alphabet
	 */
	protected void setSecretAlphabet(String alphabet) {
		
	}
}
