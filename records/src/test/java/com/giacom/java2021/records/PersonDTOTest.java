package com.giacom.java2021.records;

import java.time.LocalDate;

import org.junit.Test;
import org.modelmapper.ModelMapper;

public class PersonDTOTest {

    @Test
    public void testPersonDTO() {
        var person = new Person("Sandro", "112121212",
                LocalDate.of(1978, 10, 26));

        ModelMapper modelMapper = new ModelMapper();
        PersonDTO personDTO = modelMapper.map(person, PersonDTO.class);

        System.out.println(personDTO);

    }

}
