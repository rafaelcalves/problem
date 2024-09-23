package br.com.correa.problem;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record TestPojo(@NotEmpty(message="{error.name}") String name, @NotNull(message="{error.age}") Integer age) {
}
