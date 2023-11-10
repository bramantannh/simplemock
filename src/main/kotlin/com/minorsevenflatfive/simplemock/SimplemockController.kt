package com.minorsevenflatfive.simplemock

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SimplemockController {

    @GetMapping("/")
    fun helloWorld(@RequestParam("name") name: String): String {
        return "Hello, $name!"
    }

    @PostMapping("/dsd/getreturnpoducts")
    fun dsdGetReturnProducts(): ReturnProduct {
        return ReturnProduct(
                "TPPT-1",
                "ServiceAgent-1",
                "1",
                "AA",
                false,
                listOf(
                        ReturnProduct.Material("986055", "10"),
                        ReturnProduct.Material("984125", "10"),
                        ReturnProduct.Material("950034", "10"),
                        ReturnProduct.Material("950058", "10")
                )
        )
    }
}