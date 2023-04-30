package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class RenameTest {
    @BeforeEach
    public void SetUp() {
    }

    @Test
    public void RenameProgramTest() throws FileNotFoundException {
        File file1 = new File("hdjd");
        Rename.rename("hdjd");
        assertEquals("hdjd", file1.getName());
    }
}