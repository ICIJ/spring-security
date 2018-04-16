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

	/**
	 * hash generated with :
	 * https://github.com/ICIJ/xemx/blob/dbc7317703039f4b0f78033f20cee22adb6bd93b/config/initializers/devise.rb#L23-L33
	 */
	@Test
	public void validPasswordWithNewLineSucceeds() {
		this.sha256.setForceLowerCasePrefix(false);
		assertThat(sha256.matches("without_new_line", "{SSHA256}qmukotjZdeFxc3P+uXbyoquJpZ7Rd9sNxM6mc3WOAEwmmF8M554jfxhpuH90\nZNMz")).isTrue();
	}
}
