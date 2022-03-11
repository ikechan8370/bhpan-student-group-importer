# CaApi

All URIs are relative to *https://{host}:{port}/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**caGetPost**](CaApi.md#caGetPost) | **POST** /ca/get | 获取CA信息

<a name="caGetPost"></a>
# **caGetPost**
> CaGetRes caGetPost()

获取CA信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.CaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CaApi apiInstance = new CaApi();
try {
    CaGetRes result = apiInstance.caGetPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaApi#caGetPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CaGetRes**](CaGetRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

