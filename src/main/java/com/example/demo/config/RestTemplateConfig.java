package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;


@Component
@Getter
@Setter
public class RestTemplateConfig {
	@Value("${proxy.host:#{null}}")
	private String proxyHost;

	@Value("${proxy.port:0}")
	private int proxyPort;

	@Value("${proxy.user:#{null}}")
	private String proxyUser;

	@Value("${proxy.password:#{null}}")
	private String proxyPassword;

	@Value("${api.connect.timeout:0}")
	private int connectTimeout;

	@Value("${api.read.timeout:0}")
	private int readTimeout;

	public RestTemplateConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RestTemplateConfig(String proxyHost, int proxyPort, String proxyUser, String proxyPassword,
			int connectTimeout, int readTimeout) {
		super();
		this.proxyHost = proxyHost;
		this.proxyPort = proxyPort;
		this.proxyUser = proxyUser;
		this.proxyPassword = proxyPassword;
		this.connectTimeout = connectTimeout;
		this.readTimeout = readTimeout;
	}

	public String getProxyHost() {
		return proxyHost;
	}

	public void setProxyHost(String proxyHost) {
		this.proxyHost = proxyHost;
	}

	public int getProxyPort() {
		return proxyPort;
	}

	public void setProxyPort(int proxyPort) {
		this.proxyPort = proxyPort;
	}

	public String getProxyUser() {
		return proxyUser;
	}

	public void setProxyUser(String proxyUser) {
		this.proxyUser = proxyUser;
	}

	public String getProxyPassword() {
		return proxyPassword;
	}

	public void setProxyPassword(String proxyPassword) {
		this.proxyPassword = proxyPassword;
	}

	public int getConnectTimeout() {
		return connectTimeout;
	}

	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}

	public int getReadTimeout() {
		return readTimeout;
	}

	public void setReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
	}

	
	
}
