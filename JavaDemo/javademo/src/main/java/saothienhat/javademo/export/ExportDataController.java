package saothienhat.javademo.export;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;

import saothienhat.javademo.export.model.Employee;
import saothienhat.javademo.export.model.ExcelCell;
import saothienhat.javademo.export.model.ExcelRow;
import saothienhat.javademo.export.model.ExportFileResult;
import saothienhat.javademo.export.services.ExportDataService;

public class ExportDataController {
	private String exportPath;
	private ExportDataService exportService = new ExportDataService();
	
	public ExportFileResult exportExcel() throws IOException {
		System.out.println("ExportDataController :: Exporting Excel file....");		
		// String path = System.getProperty("user.home") + File.separator + "uploads";
		// System.out.println("Exporting Excel file....: " + path);
		
		// Test data
		List<String> headers = new ArrayList<String>();
		headers.add("Name");
		headers.add("Email");
		headers.add("Date Of Birth");
		headers.add("Salary");
		
		List<Employee> employees =  new ArrayList<Employee>();
		Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1992, 7, 21);
        employees.add(new Employee("Rajeev Singh", "rajeev@example.com", dateOfBirth.getTime(), 1200000.0));
        dateOfBirth.set(1965, 10, 15);
        employees.add(new Employee("Thomas cook", "thomas@example.com", dateOfBirth.getTime(), 1500000.0));
        dateOfBirth.set(1987, 4, 18);
        employees.add(new Employee("Steve Maiden", "steve@example.com", dateOfBirth.getTime(), 1800000.0));
        
        List<ExcelRow> rowDataList = this.getRowDataList(employees);
        
        exportService.setExportPath(getExportPath());
        ExportFileResult result = exportService.exportExcel("TestFile", "Test Sheet", headers, rowDataList);
		
		return result;
	}
	
	private List<ExcelRow> getRowDataList(List<Employee> employees) {
		List<ExcelRow> rows = new ArrayList<ExcelRow>();
        for (int index = 0; index < employees.size(); index++) {
			Employee employee = employees.get(index);
			ExcelRow row = new ExcelRow();
			row.getCells().add(new ExcelCell<String>(0, employee.getName(), CellType.STRING));
			row.getCells().add(new ExcelCell<String>(1, employee.getEmail(), CellType.STRING));
			row.getCells().add(new ExcelCell<Date>(2, employee.getDateOfBirth(), CellType.STRING));
			row.getCells().add(new ExcelCell<Double>(3, employee.getSalary(), CellType.NUMERIC));
			rows.add(row);
		}
        
		return rows;
	}

	public String getExportPath() {
		return exportPath;
	}

	public void setExportPath(String exportPath) {
		this.exportPath = exportPath;
	}
	
}
