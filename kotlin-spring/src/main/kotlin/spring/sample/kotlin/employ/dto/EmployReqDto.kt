package spring.sample.kotlin.employ.dto

class EmployReqDto {

  data class SearchDto(
    val searchName: String
  )

  data class AddDto(
    val name: String
  )

}