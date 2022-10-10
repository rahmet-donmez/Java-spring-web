package com.rahmetdonmez.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rahmetdonmez.model.Admin;
import com.rahmetdonmez.model.Bulletin;
import com.rahmetdonmez.model.Info;
import com.rahmetdonmez.model.Captain;
import com.rahmetdonmez.model.Student;
import com.rahmetdonmez.model.Team;
import com.rahmetdonmez.service.AdminService;
import com.rahmetdonmez.service.BilgiService;
import com.rahmetdonmez.service.BulletinService;
import com.rahmetdonmez.service.CaptainService;
import com.rahmetdonmez.service.StudentService;
import com.rahmetdonmez.service.TeamService;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	private AdminService admin_service;
	
	@Autowired
	private CaptainService captain_service;
	
	@Autowired
	private BilgiService bilgi_service;

	@Autowired
	private StudentService student_service;

	@Autowired
	private TeamService team_service;
	
	@Autowired
	private BulletinService bulletin_service;
	
	private Team team_temp;
	private int student_id;
	private int bulletin_id;

	
	
	@RequestMapping("/ana_sayfa")
	public String ana_sayfa(){
		return "ana_sayfa";
	}
	@RequestMapping("/hakkimizda")
	public ModelAndView hakkimizda(){
		List<Info> bilgi=bilgi_service.findInfo();
		return new ModelAndView("hakkimizda","bilgi",bilgi.get(0));
		
	}@RequestMapping("/iletisim")
	public ModelAndView iletisim(){
		List<Info> bilgi=bilgi_service.findInfo();
		return new ModelAndView("iletisim","iletisim",bilgi.get(0));
		
	}

	
	///////////////////////
	@RequestMapping("/admin_kaydet")
	public String admin_kaydet(@ModelAttribute Admin admin ){
		admin.setPassword("12345");
		admin_service.createAdmin(admin);
		return "ana_sayfa";
	}
	
	/*
	 * @RequestMapping("/kaptan_kaydet") public String kaptan_kaydet(@ModelAttribute
	 * Captain captain ){ team_temp.setCaptain(captain); captain.setTeam(team_temp);
	 * captain.setPassword("12345") ; captain_service.createCaptain(captain); return
	 * "ana_sayfa"; }
	 */
	
	@RequestMapping("/kaptan_kaydet")
	public ModelAndView kaptan_kaydet(@ModelAttribute Captain captain ){
		
			team_temp.setCaptain(captain);
			captain.setTeam(team_temp);
			captain.setPassword("12345")
			;
			captain_service.createCaptain(captain);
			
			Team team=team_service.findTeam(team_temp.getId());
			team_temp=team;
		
			return new ModelAndView("takim_detay_islem","team",team_temp);
	}
	@RequestMapping("/ogrenci_kaydet")
	public ModelAndView ogrenci_kaydet(@ModelAttribute Student student ){

		//student.getTeam().addStudent(student);
		student.setTeam(team_temp);
		team_temp.addStudent(student);
		student_service.createStudent(student);
		
		Team team=team_service.findTeam(team_temp.getId());
		team_temp=team;
		return new ModelAndView("takim_detay_islem","team",team_temp);

	}
	
	@RequestMapping("/takim_kaydet")
	public ModelAndView takim_kaydet(@ModelAttribute Team team ){
		
		team_service.createTeam(team);
		team_temp=team;
		
		return new ModelAndView("takim_detay_islem","team",team);

	}
	///////////////////////////
	@RequestMapping("/yeni_admin")
	public ModelAndView yeni_admin(){
		Admin admin=new Admin();
		return new ModelAndView("admin_ekle","admin",admin);
	}
	
	/*
	 * @RequestMapping("/yeni_kaptan") public ModelAndView
	 * yeni_kaptan(@RequestParam("id") int id){ Captain captain=new Captain();
	 * return new ModelAndView("kaptan_ekle","captain",captain); }
	 */
	
	@RequestMapping("/yeni_ogrenci")
	public ModelAndView yeni_ogrenci(){
		Student student=new Student();
		return new ModelAndView("ogrenci_ekle","student",student);
	}
	
	@RequestMapping("/yeni_takim")
	public ModelAndView yeni_takim(){
		Team team=new Team();
		return new ModelAndView("takim_ekle","team",team);//gönderilecek sayfa,sayfadaki değişken adı,gönderilecek değişken
	}
	
	
	@RequestMapping("/yeni_kaptan")
	public ModelAndView yeni_kaptan(){
		Captain captain=new Captain();
		return new ModelAndView("kaptan_ekle","captain",captain);

		
	}
	@RequestMapping("/kaptan_dondur")
	public ModelAndView kaptan_dondur(){
		
		return new ModelAndView("kaptan_guncelle","captain",team_temp.getCaptain());
	
	}
	
	@RequestMapping("/kaptan_guncelle")
	public ModelAndView kaptan_guncelle(@ModelAttribute Captain captain){
		Captain temp_captain=captain_service.findCaptain(team_temp.getCaptain().getId());
		temp_captain.setFirst_name(captain.getFirst_name());
		temp_captain.setLast_name(captain.getLast_name());
		temp_captain.setDepartment(captain.getDepartment());
		temp_captain.setEmail(captain.getEmail());

		captain_service.createCaptain(temp_captain);
		
		Team team=team_service.findTeam(team_temp.getId());
		team_temp=team;
		return new ModelAndView("takim_detay_islem","team",team_temp);
	
	}
	
	//////////////
	@RequestMapping("/admin_sil")
	public String admin_sil(Admin admin){
		admin_service.deleteAdmin(admin);
		return "ana_sayfa";
	}
	@RequestMapping("/kaptan_sil")
	public String kaptan_sil(){
		//Team team=team_service.findTeam(id);
		//Captain captain1=team.getCaptain();
		//System.out.println("------ "+ captain1.getFirst_name());
//System.out.println("***"+id);
		//captain_service.deleteCaptain(team_temp.getCaptain());
		//System.out.println("------ "+ captain1.getFirst_name());
		return "ana_sayfa";
	}
	
	@RequestMapping("/kaptan_sil2")
	public String kaptan_sil2(@RequestParam("id") int id){
		//Team team=team_service.findTeam(id);
		//Captain captain1=team.getCaptain();
		//System.out.println("------ "+ captain1.getFirst_name());
//System.out.println("***"+id);
		team_temp.setCaptain(null);
		Captain captain=captain_service.findCaptain(id);
		captain_service.deleteCaptain(id);

		//captain_service.deleteCaptain(team_temp.getCaptain());
		//System.out.println("------ "+ captain1.getFirst_name());
		return "ana_sayfa";
	}
	@RequestMapping("/ogrenci_sil")
	public ModelAndView ogrenci_sil(@RequestParam("id") int id){
		Student student=student_service.findStudent(id);
		Team team=team_service.findTeam(student.getTeam().getId());
		team.removeStudent(student);
		student_service.deleteStudent(student);
		
		team_temp=team;
		return new ModelAndView("takim_detay_islem","team",team_temp);

	}
	@RequestMapping("/takim_sil")
	public String takim_sil(){
		
		team_service.deleteTeam(team_temp);
		
		return "redirect:/takim_islemleri";

	}

	
	///////////////
	@RequestMapping("/adminler")
	public ModelAndView adminler(){
		return new ModelAndView("admin_liste","admins",admin_service.findAdmins());
	}
	

	@RequestMapping("/takimlar")
	public ModelAndView takimlar(){
		
		return new ModelAndView("takim_liste","teams",team_service.findTeams());//gönderilecek sayfa,sayfadaki değişken adı,gönderilecek değişken
	}
	@RequestMapping("/takim_islemleri")
	public ModelAndView takim_islemleri(){
		
		return new ModelAndView("takim_liste_islem","teams",team_service.findTeams());//gönderilecek sayfa,sayfadaki değişken adı,gönderilecek değişken
	}
	
	///////////////
	@RequestMapping(value = "/takim_detay")
	public ModelAndView takim_detay(@RequestParam("id") int id){
		Team team=team_service.findTeam(id);
		team_temp=team;
		Set<Student> students=team.getStudents();
		for(Student x:students) {
			System.out.println("**"+x.getFirst_name());
		}
		System.out.println("ogrenciler:" +students);
		if(team_temp.getCaptain()!=null) {
			System.out.println("kaptan: "+team_temp.getCaptain().getFirst_name());

		}
		return new ModelAndView("takim_detay","team",team);
	}
	@RequestMapping(value = "/takim_detay_islem")
	public ModelAndView takim_detay_islem(@RequestParam("id") int id){
		Team team=team_service.findTeam(id);
		team_temp=team;
		Set<Student> students=team.getStudents();
		for(Student x:students) {
			System.out.println("**"+x.getFirst_name());
		}
		System.out.println("ogrenciler:" +students);
		if(team_temp.getCaptain()!=null) {
			System.out.println("kaptan: "+team_temp.getCaptain().getFirst_name());

		}
		return new ModelAndView("takim_detay_islem","team",team);
	}
	
	
	
	
	//////////
	@RequestMapping("/ogrenci_dondur")
	public ModelAndView ogrenci_dondur(@RequestParam("id") int id){
		Student student=student_service.findStudent(id);
		student_id=student.getId();
		return new ModelAndView("ogrenci_guncelle","student",student);
	}
	@RequestMapping("/ogrenci_guncelle")
	public ModelAndView ogrenci_guncelle(@ModelAttribute Student student){
		Student temp_student=student_service.findStudent(student_id);
		temp_student.setFirst_name(student.getFirst_name());
		temp_student.setLast_name(student.getLast_name());
		temp_student.setDepartment(student.getDepartment());

		student_service.createStudent(temp_student);
		
		Team team=team_service.findTeam(team_temp.getId());
		team_temp=team;
		return new ModelAndView("takim_detay_islem","team",team_temp);
	}
	@RequestMapping("/takim_dondur")
	public ModelAndView takim_dondur(){
		return new ModelAndView("takim_guncelle","team",team_temp);

	}
	
	@RequestMapping("/takim_guncelle")
	public ModelAndView takim_guncelle(@ModelAttribute Team team ){
		Team local_team=team_service.findTeam(team_temp.getId());
		local_team.setName(team.getName());
		local_team.setInfo(team.getInfo());
		local_team.setDepartment(team.getDepartment());
		team_service.updateTeam(local_team);
		
		
		return new ModelAndView("takim_detay_islem","team",local_team);
	}
	
	///////////
	@RequestMapping("/yeni_duyuru")
	public ModelAndView yeni_duyuru(){
		Bulletin bulletin=new Bulletin();
		return new ModelAndView("duyuru_ekle","bulletin",bulletin);//gönderilecek sayfa,sayfadaki değişken adı,gönderilecek değişken
	}
	@RequestMapping("/duyurular")
	public ModelAndView duyurular(){
		
		return new ModelAndView("duyuru_liste","bulletins",bulletin_service.findBulletins());//gönderilecek sayfa,sayfadaki değişken adı,gönderilecek değişken
	}
	@RequestMapping("/duyuru_islemleri")
	public ModelAndView duyuru_islemleri(){
		
		return new ModelAndView("duyuru_liste_islem","bulletins",bulletin_service.findBulletins());//gönderilecek sayfa,sayfadaki değişken adı,gönderilecek değişken
	}
	@RequestMapping("/duyuru_kaydet")
	public String duyuru_kaydet(@ModelAttribute Bulletin bulletin ){
		
		bulletin_service.createBulletin(bulletin);
		
		return "redirect:/duyuru_islemleri";

	}
	@RequestMapping("/duyuru_sil")
	public String duyuru_sil(Bulletin bulletin){
		
		bulletin_service.deleteBulletin(bulletin);
		
		return "redirect:/duyuru_islemleri";

	}
	@RequestMapping("/duyuru_dondur")
	public ModelAndView duyuru_dondur(@RequestParam("id") int id){
		Bulletin bulletin=bulletin_service.findBulletin(id);
		return new ModelAndView("duyuru_guncelle","bulletin",bulletin);

	}
	@RequestMapping("/duyuru_guncelle")
	public ModelAndView duyuru_guncelle(@ModelAttribute Bulletin bulletin ){
		Bulletin local_bulletin=bulletin_service.findBulletin(bulletin_id);
		local_bulletin.setTexts(bulletin.getTexts());
		local_bulletin.setHead(bulletin.getHead());
		bulletin_service.createBulletin(local_bulletin);
		
		
		return new ModelAndView("duyuru_detay_islem","bulletin",local_bulletin);
	}
	@RequestMapping(value = "/duyuru_detay")
	public ModelAndView duyuru_detay(@RequestParam("id") int id){
		bulletin_id=id;

		Bulletin bulletin=bulletin_service.findBulletin(id);
		
		return new ModelAndView("duyuru_detay","bulletin",bulletin);
	}
	@RequestMapping(value = "/duyuru_detay_islem")
	public ModelAndView duyuru_detay_islem(@RequestParam("id") int id){
		bulletin_id=id;
		Bulletin bulletin=bulletin_service.findBulletin(id);
		
		return new ModelAndView("duyuru_detay_islem","bulletin",bulletin);
	}
	
	//////
	@RequestMapping(value= {"/","/index"})
	public ModelAndView index() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping(value= {"/giris_ekrani"})
	public ModelAndView giris_ekrani() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("giris");
		return mv;
	}
	@RequestMapping(value= {"/giris"})
	public ModelAndView giris() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("ana_sayfa");
		return mv;
	}
}
