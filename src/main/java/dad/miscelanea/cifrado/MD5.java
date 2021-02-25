package dad.miscelanea.cifrado;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5 {

	public static void main(String[] args) {
		
		String password = "norris";
		String md5 = DigestUtils.md5Hex(password).toUpperCase();
		System.out.println("Password cifrado: " + md5);
		
	}

}
