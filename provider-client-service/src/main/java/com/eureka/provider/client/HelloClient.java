package com.eureka.provider.client;

import com.eureka.provider.common.api.HelloApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * client
 */
@FeignClient(value = "provider-server-service")
public interface HelloClient extends HelloApi {
}
