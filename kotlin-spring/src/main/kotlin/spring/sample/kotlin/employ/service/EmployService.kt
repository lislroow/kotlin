package spring.sample.kotlin.employ.service

import org.springframework.stereotype.Service
import spring.sample.kotlin.employ.dto.EmployReqDto

@Service
class EmployService {

  fun add(addDto: EmployReqDto.AddDto) {
    println(addDto)
  }
}