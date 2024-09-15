package spring.sample.kotlin.employ.controller

import org.springframework.web.bind.annotation.*
import spring.sample.kotlin.employ.dto.EmployReqDto
import spring.sample.kotlin.employ.dto.EmployResDto

@RestController
@RequestMapping("/employ/v1")
class EmployController {
  @GetMapping("/{empNo}")
  fun getEmploy(@PathVariable("empNo") empNo: String): EmployResDto {
    return EmployResDto(empNo, "hong.gildong")
  }
  @PostMapping("/search")
  fun searchEmploy(@RequestBody body: EmployReqDto): EmployResDto {
    return EmployResDto("", body.searchName)
  }

}