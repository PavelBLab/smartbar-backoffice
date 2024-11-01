# TablesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**allTables**](TablesApi.md#allTables) | **GET** /tables | Retrieve a list of tables |
| [**createTable**](TablesApi.md#createTable) | **POST** /tables | Create a new table |
| [**deleteTable**](TablesApi.md#deleteTable) | **DELETE** /tables/{id} | Delete a table |
| [**oneTable**](TablesApi.md#oneTable) | **GET** /tables/{id} | Retrieve a table by ID |
| [**updateTable**](TablesApi.md#updateTable) | **PUT** /tables/{id} | Update an existing table |


<a name="allTables"></a>
# **allTables**
> List allTables()

Retrieve a list of tables

### Parameters
This endpoint does not need any parameter.

### Return type

[**List**](../Models/tableDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="createTable"></a>
# **createTable**
> createTable(tableDto)

Create a new table

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tableDto** | [**tableDto**](../Models/tableDto.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

<a name="deleteTable"></a>
# **deleteTable**
> deleteTable(id)

Delete a table

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

<a name="oneTable"></a>
# **oneTable**
> tableDto oneTable(id)

Retrieve a table by ID

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| Unique ID | [default to null] |

### Return type

[**tableDto**](../Models/tableDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateTable"></a>
# **updateTable**
> updateTable(id, tableDto)

Update an existing table

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| Unique ID | [default to null] |
| **tableDto** | [**tableDto**](../Models/tableDto.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

