package reilaender.Jtest;

import static org.junit.Assert.assertEquals;
import reilaender.cipher.MonoalphabeticCipher;
import reilaender.cipher.SubstitutionCipher;
//import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class SubstitutionCipherTest {
	SubstitutionCipher cipher;
	
	@Before
	public void setUp()
	{	
		cipher = new SubstitutionCipher("abcdefghijklmnopqrstuvwxyz");
	}
	/*
	 * Fall 1: Buchstabe fehlt, falsche L�nge
	 */
	@Test(expected=IllegalArgumentException.class)
	public void setSecretAlphabetTest1()
	{
		cipher.setSecretAlphabet(new String(MonoalphabeticCipher.STANDARD_ALPHABET).replace("a", ""));
	}
	
	/*
	 * Fall2: Richtige L�nge, alle Buchstaben
	 */
	@Test(expected=IllegalArgumentException.class)
	public void setSecretAlphabetTest2()
	{
		cipher.setSecretAlphabet(new String(MonoalphabeticCipher.STANDARD_ALPHABET).replace('a', 'z'));
	}
	
	/*
	 * Fall 3: Falsche L�nge, alle Buchstaben
	 */
	@Test(expected=IllegalArgumentException.class)
	public void setSecretAlphabetTest3()
	{
		cipher.setSecretAlphabet(new String(MonoalphabeticCipher.STANDARD_ALPHABET).concat("asdf"));
	}
	
	/*
	 * Fall 4: Alles korrekt
	 */
	@Test
	public void setSecretAlphabetTest4()
	{
		String temp = new StringBuilder(new String(MonoalphabeticCipher.STANDARD_ALPHABET)).reverse().toString();
		cipher.setSecretAlphabet(temp);
		temp=null;
		System.gc();
	}
	/*
	 * Verschl�sseln testen
	 */
	public void encryptTest()
	{
		cipher.setSecretAlphabet(new StringBuilder(new String(MonoalphabeticCipher.STANDARD_ALPHABET)).reverse().toString());
	}
	/*
	 * Verschl�sseln/Entschl�sseln dann vergleichen
	 */
	public void enDeCryptTest()
	{
		cipher.setSecretAlphabet(new StringBuilder(new String(MonoalphabeticCipher.STANDARD_ALPHABET)).reverse().toString());

		String encr = cipher.encrypt("asdf"); encr = cipher.decrypt(encr); //encrypten/decrypten
		
		assertEquals(encr, "asdf");
		
		encr = null; System.gc();
	}
}
