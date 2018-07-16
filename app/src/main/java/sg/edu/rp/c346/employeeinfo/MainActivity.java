package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<EmployeeItem> alEmployee;
    CustomAdapter caEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.listViewEmployee);
        alEmployee = new ArrayList<>();

        EmployeeItem emp1 = new EmployeeItem("John", "Software Technical Leader", 3400.0);
        EmployeeItem emp2 = new EmployeeItem("May", "Programmer", 2200.0);

        alEmployee.add(emp1);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);
        alEmployee.add(emp2);


        caEmployee = new CustomAdapter(this, R.layout.employee_items, alEmployee);

        lvEmployee.setAdapter(caEmployee);
    }
}
