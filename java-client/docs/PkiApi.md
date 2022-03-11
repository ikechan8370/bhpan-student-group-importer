# PkiApi

All URIs are relative to *https://{host}:{port}/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pkiAuthenPost**](PkiApi.md#pkiAuthenPost) | **POST** /pki/authen | 使用PKI认证
[**pkiOriginalPost**](PkiApi.md#pkiOriginalPost) | **POST** /pki/original | 获取original

<a name="pkiAuthenPost"></a>
# **pkiAuthenPost**
> PkiAuthenRes pkiAuthenPost(body)

使用PKI认证

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.PkiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PkiApi apiInstance = new PkiApi();
PkiAuthenReq body = new PkiAuthenReq(); // PkiAuthenReq | 
try {
    PkiAuthenRes result = apiInstance.pkiAuthenPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PkiApi#pkiAuthenPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PkiAuthenReq**](PkiAuthenReq.md)|  |

### Return type

[**PkiAuthenRes**](PkiAuthenRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pkiOriginalPost"></a>
# **pkiOriginalPost**
> PkiOriginalRes pkiOriginalPost()

获取original

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.PkiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PkiApi apiInstance = new PkiApi();
try {
    PkiOriginalRes result = apiInstance.pkiOriginalPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PkiApi#pkiOriginalPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PkiOriginalRes**](PkiOriginalRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

