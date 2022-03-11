# PingApi

All URIs are relative to *https://{host}:{port}/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pingPost**](PingApi.md#pingPost) | **POST** /ping | 检查服务器是否在线

<a name="pingPost"></a>
# **pingPost**
> pingPost()

检查服务器是否在线

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.PingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PingApi apiInstance = new PingApi();
try {
    apiInstance.pingPost();
} catch (ApiException e) {
    System.err.println("Exception when calling PingApi#pingPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

