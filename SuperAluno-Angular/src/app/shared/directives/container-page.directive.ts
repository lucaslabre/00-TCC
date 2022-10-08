import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appContainerPage]'
})
export class ContainerPageDirective {

  constructor(private elementRef: ElementRef) {
    this.elementRef.nativeElement.style.display = "flex";
    this.elementRef.nativeElement.style.justifyContent = "center";
    this.elementRef.nativeElement.style.marginTop = "0.5rem";
  }

}
