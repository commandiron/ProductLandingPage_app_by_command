package com.demirli.a23productlandingpage

data class Products(
    var firstImageList: List<Int>,
    var brand: String,
    var definement: String,
    var operatingSystem: String,
    var ram: String,
    var maxScreenResolution: String,
    var displayModel: String,
    var screenSize: String,
    var mobileConnection: String,
    var internalStorage: String,
    var imageUri: String
)