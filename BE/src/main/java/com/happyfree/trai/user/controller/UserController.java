package com.happyfree.trai.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "사용자")
@RestController
public class UserController {

	@Operation(summary = "회원가입")
	@ApiResponses(value = {@ApiResponse(responseCode = "200")})
	@PostMapping("/api/users/join")
	public void a() {

	}

	@Operation(summary = "로그인")
	@ApiResponses(value = {@ApiResponse(responseCode = "200")})
	@PostMapping("/login")
	public void b() {

	}

	@Operation(summary = "로그아웃")
	@ApiResponses(value = {@ApiResponse(responseCode = "200")})
	@PostMapping("/logout")
	public void c() {

	}
}