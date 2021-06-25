package com.giacom.java2021.records;

import java.time.LocalDate;

import org.junit.Ignore;
import org.junit.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

public class PersonDTOTest {

    @Test
    @Ignore
    public void testPersonDTOModelMapper() {
        var person = new Person("Sandro", "112121212",
                LocalDate.of(1978, 10, 26));

        ModelMapper modelMapper = new ModelMapper();
        PersonDTO personDTO = modelMapper.map(person, PersonDTO.class);

        System.out.println(personDTO);
    }

    @Test
    public void testPersonDTOTypedModelMapper() {
        var person = new Person("Sandro", "112121212",
                LocalDate.of(1978, 10, 26));

        ModelMapper modelMapper = getTypedModelMapper();
        PersonDTO personDTO = modelMapper.map(person, PersonDTO.class);

        System.out.println(personDTO);
    }


    private ModelMapper getTypedModelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        TypeMap<Person, PersonDTO> personDTOTypeMap = modelMapper.getTypeMap(
                Person.class, PersonDTO.class
        );
        if (personDTOTypeMap == null) {
            personDTOTypeMap = modelMapper.createTypeMap(Person.class, PersonDTO.class);
        }
        personDTOTypeMap.setProvider(request -> {
            Person source = Person.class.cast(request.getSource());
            return new PersonDTO(source.getName(), source.getOfficialDocument(), source.getDateBirth());
        });
        return modelMapper;
    }

}
