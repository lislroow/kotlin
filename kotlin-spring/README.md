
#### 4) @RequestBody 사용 시 cannot deserialize 오류

```kotlin
@RestController
@RequestMapping("/employ/v1")
class EmployController {
  @PostMapping("/search")
  fun searchEmploy(@RequestBody body: EmployReqDto): EmployResDto {
    return EmployResDto("", body.searchName)
  }
}
data class EmployReqDto(
  val searchName: String,
)
```
코드에서 gradle 의존성

```gradle
dependencies {
  implementation platform("org.springframework.boot:spring-boot-dependencies:${spring_boot_version}")
  implementation "org.springframework.boot:spring-boot-starter-web"
  implementation "com.fasterxml.jackson.module:jackson-module-kotlin" // 추가 필요
}
```


#### 3) intelliJ 에서 HotSwap 기능 확인

- `ctrl + alt + s` > `File | Settings | Build, Execution, Deployment | Debugger | HotSwap` 이동
- Reload classes after compilation 을 always 로 선택 
- `project build`: `ctrl + F9`
- `Rerun`: `ctrl + F11`

#### 2) @GetMapping 예시

```kotlin
@RestController
@RequestMapping("/employ/v1")
class EmployController {
  @GetMapping("/{empNo}")
  fun getEmploy(@PathVariable("empNo") empNo: String): EmployResDto {
    return EmployResDto(empNo, "hong.gildong")
  }
}

data class EmployResDto (
  val empNo: String,
  val name: String,
)
```


#### 1) class 앞에 open 을 붙인 이유

```kotlin
@SpringBootApplication
open class SpringMain

fun main(args: Array<String>) {
  runApplication<SpringMain>(*args)
}
```

- kotlin 에서 open 키워드를 사용하는 이유는 kotlin 의 클래스는 final 이기 때문
- spring 은 내부적으로 클래스를 상속하고 proxy 를 생성하는 방식으로 여러 기능을 제공하는데, 특히 @Configuration 이 선언된 클래스는 runtime 에 proxy 객체를 만들어야 할 수 있기 때문에 상속이 가능해야 함
- @SpringBootApplication 이 선언된 클래스는 proxy 객체가 생성되어야 하므로 open 키워드로 상속이 가능하도록 해야 함


