package com.dashboard.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import com.dashboard.beans.InterviewBean;
import com.dashboard.beans.IntervieweeBean;
import com.dashboard.beans.InterviewerBean;
import com.dashboard.beans.ProfileBean;
import com.dashboard.beans.SkillBean;
import com.dashboard.beans.StudentSkillBean;

public interface AdminDAO 
{
//	public String addDoctor(DoctorBean doctoerBean);
//	public Boolean modifyDoctor(DoctorBean doctorBean);
//	public ArrayList<DoctorBean> viewAllDoctors();
//	public int removeDoctor(String doctorID);
//	public ArrayList<DoctorBean> suggestDoctors(String patientId, Date date);
//	public Map <PatientBean, AppointmentBean> viewPatientsByDate(Date appointmentDate);

	Map <ProfileBean, ArrayList<StudentSkillBean>> viewAllStudents();
	Map<ProfileBean, ArrayList<StudentSkillBean>> viewAllTrainers();
	String iSchedule(String[] interviewer, String[] interviwee, Date iDate);
	Map<InterviewBean, Map<Map<ProfileBean, InterviewerBean>, Map<ProfileBean, IntervieweeBean>>> ViewAllScheduledInterview();
	String DeleteInterview(String[] interviewIDstoDelete);
	String aa(String id);
	
	
	//vvvvvvvvvvvvvvvvvvvvvvvvv
	public String addSkill(SkillBean skillBean);
	ProfileBean getProfileBean(String id);
	public int deleteSkill(int skillId);
	ArrayList<SkillBean> viewSkills();
}
