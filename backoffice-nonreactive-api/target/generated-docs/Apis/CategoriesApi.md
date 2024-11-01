# CategoriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**allCategories**](CategoriesApi.md#allCategories) | **GET** /categories | Retrieve a list of categories |
| [**createCategory**](CategoriesApi.md#createCategory) | **POST** /categories | Create a new category |
| [**deleteCategory**](CategoriesApi.md#deleteCategory) | **DELETE** /categories/{id} | Delete a category |
| [**oneCategory**](CategoriesApi.md#oneCategory) | **GET** /categories/{id} | Retrieve a category by ID |
| [**updateCategory**](CategoriesApi.md#updateCategory) | **PUT** /categories/{id} | Update an existing category |


<a name="allCategories"></a>
# **allCategories**
> List allCategories()

Retrieve a list of categories

### Parameters
This endpoint does not need any parameter.

### Return type

[**List**](../Models/categoryDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="createCategory"></a>
# **createCategory**
> createCategory(categoryDto)

Create a new category

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **categoryDto** | [**categoryDto**](../Models/categoryDto.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

<a name="deleteCategory"></a>
# **deleteCategory**
> deleteCategory(id)

Delete a category

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

<a name="oneCategory"></a>
# **oneCategory**
> categoryDto oneCategory(id)

Retrieve a category by ID

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| Unique ID | [default to null] |

### Return type

[**categoryDto**](../Models/categoryDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateCategory"></a>
# **updateCategory**
> updateCategory(id, categoryDto)

Update an existing category

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| Unique ID | [default to null] |
| **categoryDto** | [**categoryDto**](../Models/categoryDto.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

