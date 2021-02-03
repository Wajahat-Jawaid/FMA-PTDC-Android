package com.salampakistan.model.response.getpoiresponse

data class Data(
    val __v: Int,
    val _id: String,
    val business_status: String,
    val dist: Dist,
    val formatted_address: String,
    val icon: String,
    val location: Location,
    val name: String,
    val photos: List<Photo>,
    val place_id: String,
    val plus_code: PlusCode,
    val rating: Double,
    val reference: String,
    val types: List<String>,
    val user_ratings_total: Int
)