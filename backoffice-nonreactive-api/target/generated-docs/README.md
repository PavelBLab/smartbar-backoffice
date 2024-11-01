# Documentation for Smartbar Backoffice

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

| Class | Method | HTTP request | Description |
|------------ | ------------- | ------------- | -------------|
| *ArticlesApi* | [**allArticles**](Apis/ArticlesApi.md#allarticles) | **GET** /articles | Retrieve a list of articles |
*ArticlesApi* | [**createArticle**](Apis/ArticlesApi.md#createarticle) | **POST** /articles | Create a new article |
*ArticlesApi* | [**deleteArticle**](Apis/ArticlesApi.md#deletearticle) | **DELETE** /articles/{id} | Delete an article |
*ArticlesApi* | [**oneArticle**](Apis/ArticlesApi.md#onearticle) | **GET** /articles/{id} | Retrieve an article by ID |
*ArticlesApi* | [**updateArticle**](Apis/ArticlesApi.md#updatearticle) | **PUT** /articles/{id} | Update an existing article |
| *CategoriesApi* | [**allCategories**](Apis/CategoriesApi.md#allcategories) | **GET** /categories | Retrieve a list of categories |
*CategoriesApi* | [**createCategory**](Apis/CategoriesApi.md#createcategory) | **POST** /categories | Create a new category |
*CategoriesApi* | [**deleteCategory**](Apis/CategoriesApi.md#deletecategory) | **DELETE** /categories/{id} | Delete a category |
*CategoriesApi* | [**oneCategory**](Apis/CategoriesApi.md#onecategory) | **GET** /categories/{id} | Retrieve a category by ID |
*CategoriesApi* | [**updateCategory**](Apis/CategoriesApi.md#updatecategory) | **PUT** /categories/{id} | Update an existing category |
| *TablesApi* | [**allTables**](Apis/TablesApi.md#alltables) | **GET** /tables | Retrieve a list of tables |
*TablesApi* | [**createTable**](Apis/TablesApi.md#createtable) | **POST** /tables | Create a new table |
*TablesApi* | [**deleteTable**](Apis/TablesApi.md#deletetable) | **DELETE** /tables/{id} | Delete a table |
*TablesApi* | [**oneTable**](Apis/TablesApi.md#onetable) | **GET** /tables/{id} | Retrieve a table by ID |
*TablesApi* | [**updateTable**](Apis/TablesApi.md#updatetable) | **PUT** /tables/{id} | Update an existing table |


<a name="documentation-for-models"></a>
## Documentation for Models

 - [articleDto](./Models/articleDto.md)
 - [categoryDto](./Models/categoryDto.md)
 - [tableDto](./Models/tableDto.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
