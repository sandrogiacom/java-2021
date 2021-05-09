package com.giacom.java2021.records;

import java.time.LocalDate;
import java.util.Objects;

public final class Person {

    private String name;
    private String officialDocument;
    private LocalDate dateBirth;

    public Person(String name, String officialDocument, LocalDate dateBirth) {
        this.name = name;
        this.officialDocument = officialDocument;
        this.dateBirth = dateBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficialDocument() {
        return officialDocument;
    }

    public void setOfficialDocument(String officialDocument) {
        this.officialDocument = officialDocument;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return getName().equals(person.getName()) && Objects.equals(getOfficialDocument(), person.getOfficialDocument()) && Objects.equals(getDateBirth(), person.getDateBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getOfficialDocument(), getDateBirth());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", officialDocument='").append(officialDocument).append('\'');
        sb.append(", dateBirth=").append(dateBirth);
        sb.append('}');
        return sb.toString();
    }
}
