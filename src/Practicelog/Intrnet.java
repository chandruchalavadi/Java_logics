package Practicelog;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Intrnet {
	public static void main(String[] args) {

		String str = "126.166.50.50";
		try {

			InetAddress ipa = InetAddress.getByName(str);
			if (ipa instanceof InetAddress) {
				System.out.println(ipa + "is valid ipv4 address");
			} else if (ipa instanceof Inet6Address) {
				System.out.println(ipa + "is not a ipv6 address");
			}

		} catch (UnknownHostException e) {
			System.out.println("invalid ip address");
		}

	}
}
