import { Component, OnInit, Input } from '@angular/core';

@Component({
    selector: 'my-button',
    template: `
        <button (click)="handleClick()">{{caption}}</button>
    
    `
})
export class ButtonComponent implements OnInit {


    @Input('caption')caption : string = ''
    constructor() { }

    ngOnInit() { 

    }
    handleClick(){
        console.log('Button clicked..')
        // this.caption = "Change values"
    }

}