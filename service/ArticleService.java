package service;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleService {
	
	//CRAETE
	public void creatWriting(int seq,String title,String content ,String writer ,String regDate);
	//READ
	public ArrayList<ArticleBean> list();
	public ArrayList<ArticleBean> findByWriter();
	public ArticleBean findBySeq();
	
	public void countSeq();
	
	public void updateContent(int seq , String newContent);
	public void updateTitle(int seq , String newTitle);
	
	public void delete(int seq);
	
}
