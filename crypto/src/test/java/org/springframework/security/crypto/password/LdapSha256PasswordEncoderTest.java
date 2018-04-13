package org.springframework.security.crypto.password;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LdapSha256PasswordEncoderTest {
	LdapSha256PasswordEncoder sha256 = new LdapSha256PasswordEncoder();
	@Test
	public void validPasswordSucceeds() {
		this.sha256.setForceLowerCasePrefix(false);
		assertThat(sha256.matches("saikudummybtpr", "{SSHA256}IdO3UZ9sw7XFDC/02Wml3TmISb2zS4iu7IrvaciWsf372XP7qf0n0g==")).isTrue();
	}
}
