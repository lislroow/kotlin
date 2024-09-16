package spring.sample.kotlin.employ.controller

import org.springframework.web.bind.annotation.*
import spring.sample.kotlin.employ.dto.EmployReqDto
import spring.sample.kotlin.employ.dto.EmployResDto
import spring.sample.kotlin.employ.service.EmployService

@RestController
@RequestMapping("/employ/v1")
class EmployController(private val employService : EmployService) {

  //@Autowired
  //lateinit var employService2: EmployService

  @GetMapping("/{empNo}")
  fun getEmploy(@PathVariable("empNo") empNo: String): EmployResDto.EmployDto {
    return EmployResDto.EmployDto(empNo, "hong.gildong")
  }
  @PostMapping("/search")
  fun searchEmploy(@RequestBody body: EmployReqDto.SearchDto): EmployResDto.EmployDto {
    return EmployResDto.EmployDto("", body.searchName)
  }
  @PostMapping("")
  fun addEmploy(@RequestBody body: EmployReqDto.AddDto) {
    employService.add(body)
  }

}