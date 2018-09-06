package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import com.netflix.appinfo.DataCenterInfo;
import com.netflix.appinfo.EurekaInstanceConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableEurekaClient
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}


@Configuration
class DemoConfiguration {


	@Bean
	EurekaInstanceConfig eurekaInstanceConfig() {
		return new EurekaInstanceConfigWithNoOrder();
	}

	private class EurekaInstanceConfigWithNoOrder implements EurekaInstanceConfig {

		@Override
		public String getInstanceId() {
			return "";
		}

		@Override
		public String getAppname() {
			return "";
		}

		@Override
		public String getAppGroupName() {
			return "";
		}

		@Override
		public boolean isInstanceEnabledOnit() {
			return false;
		}

		@Override
		public int getNonSecurePort() {
			return 0;
		}

		@Override
		public int getSecurePort() {
			return 0;
		}

		@Override
		public boolean isNonSecurePortEnabled() {
			return false;
		}

		@Override
		public boolean getSecurePortEnabled() {
			return false;
		}

		@Override
		public int getLeaseRenewalIntervalInSeconds() {
			return 0;
		}

		@Override
		public int getLeaseExpirationDurationInSeconds() {
			return 0;
		}

		@Override
		public String getVirtualHostName() {
			return "";
		}

		@Override
		public String getSecureVirtualHostName() {
			return "";
		}

		@Override
		public String getASGName() {
			return "";
		}

		@Override
		public String getHostName(boolean refresh) {
			return "";
		}

		@Override
		public Map<String, String> getMetadataMap() {
			return new HashMap<>();
		}

		@Override
		public DataCenterInfo getDataCenterInfo() {
			return null;
		}

		@Override
		public String getIpAddress() {
			return "";
		}

		@Override
		public String getStatusPageUrlPath() {
			return "";
		}

		@Override
		public String getStatusPageUrl() {
			return "";
		}

		@Override
		public String getHomePageUrlPath() {
			return "";
		}

		@Override
		public String getHomePageUrl() {
			return "";
		}

		@Override
		public String getHealthCheckUrlPath() {
			return "";
		}

		@Override
		public String getHealthCheckUrl() {
			return "";
		}

		@Override
		public String getSecureHealthCheckUrl() {
			return "";
		}

		@Override
		public String[] getDefaultAddressResolutionOrder() {
			return null;
		}

		@Override
		public String getNamespace() {
			return "";
		}
	}
}