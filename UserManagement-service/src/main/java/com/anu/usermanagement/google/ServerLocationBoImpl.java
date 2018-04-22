package com.anu.usermanagement.google;

import java.io.IOException;
import java.net.URL;

import org.springframework.stereotype.Service;

import com.maxmind.geoip.Location;
import com.maxmind.geoip.LookupService;
import com.maxmind.geoip.regionName;

@Service("ServerLocationBo")
public class ServerLocationBoImpl implements ServerLocationBo {

	public ServerLocation getLocation(String ipAddress) {

		String dataFile = "D://AugWork/UserManagement/UserManagement-web/src/main/resources/GeoLiteCity.dat";
		return getLocation(ipAddress, dataFile);

	}

	private ServerLocation getLocation(String ipAddress, String locationDataFile1) {

		ServerLocation serverLocation = null;

		URL url = getClass().getClassLoader().getResource(locationDataFile1);

		if (url == null) {
			System.err.println("location database is not found - "
					+ locationDataFile1);
		} else {

			try {

				serverLocation = new ServerLocation();

				LookupService lookup = new LookupService(url.getPath(),
						LookupService.GEOIP_MEMORY_CACHE);
				Location locationServices = lookup.getLocation(ipAddress);

				serverLocation.setCountryCode(locationServices.countryCode);
				serverLocation.setCountryName(locationServices.countryName);
				serverLocation.setRegion(locationServices.region);
				serverLocation.setRegionName(regionName.regionNameByCode(
						locationServices.countryCode, locationServices.region));
				serverLocation.setCity(locationServices.city);
				serverLocation.setPostalCode(locationServices.postalCode);
				serverLocation.setLatitude(String
						.valueOf(locationServices.latitude));
				serverLocation.setLongitude(String
						.valueOf(locationServices.longitude));

			} catch (IOException e) {

				System.err.println(e.getMessage());

			}

		}

		return serverLocation;

	}
}