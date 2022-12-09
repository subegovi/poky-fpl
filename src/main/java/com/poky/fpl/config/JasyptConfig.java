package com.poky.fpl.config;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JasyptConfig {

	public static SimpleStringPBEConfig getSimpleStringPBEConfig() {
		final SimpleStringPBEConfig pbeConfig = new SimpleStringPBEConfig();
		
		// TODO - find solution to remove hard coded password
		pbeConfig.setPassword("Nepali@83209"); 
		pbeConfig.setAlgorithm("PBEWithMD5AndDES");
		pbeConfig.setKeyObtentionIterations("1000");
		pbeConfig.setPoolSize("1");
		pbeConfig.setProviderName("SunJCE");
		pbeConfig.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
		pbeConfig.setStringOutputType("base64");
		return pbeConfig;
	}

	@Bean(name = "jasyptStringEncryptor")
	public StringEncryptor encryptor() {
		final PooledPBEStringEncryptor pbeStringEncryptor = new PooledPBEStringEncryptor();
		pbeStringEncryptor.setConfig(getSimpleStringPBEConfig());
		return pbeStringEncryptor;
	}
}