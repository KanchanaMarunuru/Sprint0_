import { Component, OnInit } from '@angular/core';
import { CandidateService } from '../candidate.service';
import * as XLSX from 'xlsx';
import { Candidate } from '../candidate';

@Component({
  selector: 'app-candidate',
  templateUrl: './candidate.component.html',
  styleUrls: ['./candidate.component.css']
})
export class CandidateComponent implements OnInit {

  constructor (private candidateService: CandidateService) {}
  
  // fetchCandidate(): void {
  //       this.candidateService.getCandidateList().subscribe((data: Candidate[]) => {
  //         this.candidates = data;
  //       });
  //     }
      
  public candidates;
  candidate:Candidate = new Candidate()
  

  ngOnInit(): void {
    this.getCandidateDetails();
    // this.fetchCandidate();

  }

  getCandidateDetails(){
    this.candidateService.getCandidateList().subscribe(
      data=>{
        this.candidates = data;
        console.log(data);
      },
      (error)=>console.log(error)
    )
  }
  exportToExcel(): void {
    const fileName = 'candidate.xlsx';
    const worksheet: XLSX.WorkSheet = XLSX.utils.json_to_sheet(this.candidates);
    const workbook: XLSX.WorkBook = { Sheets: { 'candidate': worksheet }, SheetNames: ['candidate'] };
    XLSX.writeFile(workbook, fileName);
  }

}


