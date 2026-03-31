package employeeWagesTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import employeeWages.EmpWageBuilder;

public class EmpWageBuilderTest {
	EmpWageBuilder builder;

    // Runs Before Each Test
    @BeforeEach
    void setup() {
        builder = new EmpWageBuilder();
    }

    // Test UC8 → Add Company
    @Test
    void testAddCompany() {
        builder.addCompany("TCS", 20, 20, 100);

        int size = builder.companyList.size();

        assertEquals(1, size);
    }

    // Test Regex Validation
    @Test
    void testInvalidCompanyName() {
        builder.addCompany("TCS123", 20, 20, 100);

        int size = builder.companyList.size();

        assertEquals(0, size);
    }

    // Test Wage Computation
    @Test
    void testComputeWages() {

        builder.addCompany("Infosys", 20, 5, 40);
        builder.computeWages();

        int total = builder.getTotalWage("Infosys");

        assertTrue(total >= 0);
    }

    // Test Get Total Wage
    @Test
    void testGetTotalWage() {

        builder.addCompany("Wipro", 20, 5, 40);
        builder.computeWages();

        int wage = builder.getTotalWage("Wipro");

        assertNotNull(wage);
    }

    // ✅ Test Multiple Companies
    @Test
    void testMultipleCompanies() {

        builder.addCompany("TCS", 20, 5, 40);
        builder.addCompany("Infosys", 25, 5, 40);

        builder.computeWages();

        int wage1 = builder.getTotalWage("TCS");
        int wage2 = builder.getTotalWage("Infosys");

        assertTrue(wage1 >= 0);
        assertTrue(wage2 >= 0);
    }
}
