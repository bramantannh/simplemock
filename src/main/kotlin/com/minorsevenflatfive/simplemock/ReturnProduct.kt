package com.minorsevenflatfive.simplemock

import com.fasterxml.jackson.annotation.JsonProperty

data class ReturnProduct(
    @JsonProperty("TPPT") val tppt: String,
    @JsonProperty("ServiceAgent") val serviceAgent: String,
    @JsonProperty("LockedDriverNumber") val driverNumber: String,
    @JsonProperty("LockedDriverName") val driverName: String,
    @JsonProperty("Locked") val locked: Boolean,
    @JsonProperty("Materials") val materials: List<Material>
) {

    data class Material(
        @JsonProperty("MaterialCode") val materialCode: String,
        @JsonProperty("totalQty") val totalQty: String
    )
}