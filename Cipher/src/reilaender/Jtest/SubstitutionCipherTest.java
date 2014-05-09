package reilaender.Jtest;

import static org.junit.Assert.assertEquals;
import reilaender.cipher.MonoalphabeticCipher;
import reilaender.cipher.SubstitutionCipher;
//import static org.junit.Assert.assertNotEquals; --> Package wird nicht gefunden

import org.junit.Before;
import org.junit.Test;

public class SubstitutionCipherTest {
	
	@Before
	public void setUp() {	
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void setSecretAlphabetTest1() { //Wenn falsche länge und buchstabe fehlt
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void setSecretAlphabetTest2() { //Wenn richtige länge aber ein buchstabe fehlt
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void setSecretAlphabetTest3() { //Wenn falsche länge aber alle buchstaben
		
	}
	
	@Test
	public void setSecretAlphabetTest4() { //Wenn alles richtig...
		
	}
	
	public void encryptTest() {//verschlüsseln
		
	}
	
	public void enDeCryptTest() {//ver- und entschlüsseln
		
	}
}
