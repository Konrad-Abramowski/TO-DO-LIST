package com.example.todoapp.model.projection;

import com.example.todoapp.model.Task;
import com.example.todoapp.model.TaskGroup;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


class GroupReadModelTest {
    @Test
    @DisplayName("should create null deadline for group when no tasks deadlines")
    void constructor_noDeadlines_createsNullDeadline() {
        // given
        var source = new TaskGroup();
        source.setDescription("foo");
        source.setTasks(Set.of(new Task("bar", null)));
        // when
        var result = new GroupReadModel(source);
        // then
        Assertions.assertThat(result).hasFieldOrPropertyWithValue("deadline", null);
    }

}