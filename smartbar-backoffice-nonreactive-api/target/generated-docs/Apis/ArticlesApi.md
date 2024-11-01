# ArticlesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**allArticles**](ArticlesApi.md#allArticles) | **GET** /articles | Retrieve a list of articles |
| [**createArticle**](ArticlesApi.md#createArticle) | **POST** /articles | Create a new article |
| [**deleteArticle**](ArticlesApi.md#deleteArticle) | **DELETE** /articles/{id} | Delete an article |
| [**oneArticle**](ArticlesApi.md#oneArticle) | **GET** /articles/{id} | Retrieve an article by ID |
| [**updateArticle**](ArticlesApi.md#updateArticle) | **PUT** /articles/{id} | Update an existing article |


<a name="allArticles"></a>
# **allArticles**
> List allArticles()

Retrieve a list of articles

### Parameters
This endpoint does not need any parameter.

### Return type

[**List**](../Models/articleDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="createArticle"></a>
# **createArticle**
> createArticle(x-category-id, articleDto)

Create a new article

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **x-category-id** | **Long**|  | [default to null] |
| **articleDto** | [**articleDto**](../Models/articleDto.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

<a name="deleteArticle"></a>
# **deleteArticle**
> deleteArticle(id)

Delete an article

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| Unique ID | [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="oneArticle"></a>
# **oneArticle**
> articleDto oneArticle(id)

Retrieve an article by ID

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| Unique ID | [default to null] |

### Return type

[**articleDto**](../Models/articleDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateArticle"></a>
# **updateArticle**
> updateArticle(id, articleDto)

Update an existing article

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| Unique ID | [default to null] |
| **articleDto** | [**articleDto**](../Models/articleDto.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

