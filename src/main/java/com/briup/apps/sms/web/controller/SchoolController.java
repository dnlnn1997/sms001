package com.briup.apps.sms.web.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.briup.apps.sms.bean.School;
import com.briup.apps.sms.service.SchoolService;


@RestController
@RequestMapping("/school")
public class SchoolController {
	@Autowired
	private SchoolService schoolService;
	
	@PostMapping
	public String saveOrUpdate(School school) {
		try {
			schoolService.saveOrUpdate(school);
			return "保存或更新成功";
		}catch(Exception e) {
			
			e.printStackTrace();
			return e.getMessage();
			
		}
			
		
	}

	@GetMapping("selectAll")
	public List<School> selectAll(){
		return schoolService.selectAll();
	}
		
		@GetMapping("deleteById")
		public String deleteById(long id) {
			try {
				schoolService.deleteById(id);
				return "删除成功";
				
			}catch (Exception e){
				//打印异常信息，返回异常信息
				e.printStackTrace();
				return e.getMessage();
			}
		}
		
		
	}

