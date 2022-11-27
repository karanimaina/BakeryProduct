# BAKERY PRODUCT  REST API application

The REST API to the bakery product  application  is described below.

## Create a new product

### Request`POST http://localhost:8087/api/add/product'


{   
    curl -i -H 'Accept: application/json' -d 
    "name":"Lcd display",
    "brand":"samsung",
    "availability":"AVAILABLE",
    "sellingPrice":"200",
    "discountPrice":"30",
    "percentageDiscount":"5"


### Response`

    HTTP/1.1 201 Created
    Date: 2022-11-27T08:40:01.759+00:00
    Status: 201 Created
    Connection: keep-alive
    Content-Type: application/json
    Content-Length: 36
    
    {
    "status": 201,
    "data": {
        "id": 1,
        "name": "Lcd display",
        "brand": "samsung",
        "availability": "AVAILABLE",
        "sellingPrice": "200",
        "discountPrice": "30",
        "percentageDiscount": "5",
        "productDetails": null,
        "postedDate": "2022-11-27T08:40:01.759+00:00"
    },
    "message": "product created"
}



## Add product details to product
### Request

`POST http://localhost:8087/api/add/product/details/1`

    curl -i -H 'Accept: application/json' -d 
    "businessInfo":"mariam cakes and butter",
    "description":"your partner in cake prooduction",
    "specification":"rounded browm bread",
    "packageIncludes":"blueband and butter",
    "weight":"200g",
    "type":"BREAD"


### Response

    HTTP/1.1 201 Created
    Date: 2022-11-27T08:40:01.759+00:00
    Status: 201 Created
    Connection: keep-alive
    Content-Type: application/json
    Content-Length: 36
    
    {
    "status": 201,
    "data": {
        "id": 1,
        "name": "Lcd display",
        "brand": "samsung",
        "availability": "AVAILABLE",
        "sellingPrice": "200",
        "discountPrice": "30",
        "percentageDiscount": "5",
        "productDetails": {
            "id": 2,
            "businessInfo": "mariam cakes and butter",
            "description": "your partner in cake prooduction",
            "specification": "rounded browm bread",
            "packageIncludes": "blueband and butter",
            "weight": "200g",
            "type": "BREAD",
            "dateOfManufacture": "2022-11-27T08:57:38.879+00:00"
        },
        "postedDate": "2022-11-27T08:40:01.759+00:00"
    },
    "message": "product details added"
}



## Get All Products

### Request 

    GET  http://localhost:8087/api/get/all/product`
    curl -i -H 'Accept: application/json '    

### Response

    HTTP/1.1 200 OK
    Date: 2022-11-27T08:40:01.759+00:0
    Status: 200 OK
    Connection: close
    Content-Type: application/json
    Content-Length: 2
    
    {
    "status": 200,
    "data": [
        {
            "id": 1,
            "name": "Lcd display",
            "brand": "samsung",
            "availability": "AVAILABLE",
            "sellingPrice": "200",
            "discountPrice": "30",
            "percentageDiscount": "5",
            "productDetails": 1,
            "postedDate": "2022-11-27T08:40:01.759+00:00"
        }
    ],
    "message": "product retrieved successfully"
}


## Get a product by date

### Request

`GET "http://localhost:8087/api/update/poduct/dto
  curl -i -H 'Accept: application/json' http://localhost:8087/api/update/poduct/dto

### Response

    "status": 200,
    "data": [
            "name": "Lcd display",
            "brand": "samsung",
            "availability": "AVAILABLE",
            "sellingPrice": "200",
            "discountPrice": "30",
            "percentageDiscount": "5",
            "productDetails": 1,

    HTTP/1.1 200 OK
    Date: Thu, 24 Feb 2011 12:36:30 GMT
    Status: 200 OK
    Connection: close
    Content-Type: application/json
    Content-Length: 36
    
    {
    "status": 200,
    "data": [
        {
            "id": 1,
            "name": "Lcd display",
            "brand": "samsung",
            "availability": "AVAILABLE",
            "sellingPrice": "200",
            "discountPrice": "30",
            "percentageDiscount": "5", curl -i -H 'Accept: application/json
            "productDetails": null,
            "postedDate": "2022-11-27T08:40:01.759+00:00"
        }
    ],
    "message": "product  details details retrieved for date 2022-11-27T08:40:01.759+00:00"
}

## Update product Details

### Request

    curl -i -H 'Accept: application/json' http://localhost:8081/update/poduct/details/dto
    {
            "name": "pwer bread",
            "brand": "mariam cakes",
            "availability": "AVAILABLE",
            "sellingPrice": "200",
            "discountPrice": "30",
            "percentageDiscount": "5",
            "productDetails": 1,
    }
### Response

    HTTP/1.1 404 Not Found
    Date: Thu, 24 Feb 2011 12:36:30 GMT
    Status: 404 Not Found
    Connection: close
    Content-Type: application/json
    Content-Length: 35
    
    {
    "date": "2022-11-26 02:24:20",
    "status": 200,
    "data": {
            "id": 1,
            "name": "pwer bread",
            "brand": "mariam cakes",
            "availability": "AVAILABLE",
            "sellingPrice": "200",
            "discountPrice": "30",
            "percentageDiscount": "5",
            "productDetails": 1,
    },
    "message": "product updated successfully"
    }

### Delete a product

`DELETE http://localhost:8087/delete/product/1`

    curl -i -H 'Accept: application/json'http://localhost:8087/delete/product/1

### Response

    HTTP/1.1 201 Created
    Date: Thu, 24 Feb 2011 12:36:31 GMT
    Status: 201 Created
    Connection: close
    Content-Type: application/json
    Location: /thing/2
    Content-Length: 35
    
    {
    "date": "2022-11-26 02:28:15",
    "status": 200,
    "data": 'product has been deleted ",
    "message": "product with record 1 deleted successfully"
    }



