/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.node;

import expression.analysis.*;

@SuppressWarnings("nls")
public final class ATermoRelacionalTermoRelacional extends PTermoRelacional
{
    private PTermoRelacional _termoRelacional_;
    private PSinalIgualgade _sinalIgualgade_;
    private PFatorRelacional _fatorRelacional_;

    public ATermoRelacionalTermoRelacional()
    {
        // Constructor
    }

    public ATermoRelacionalTermoRelacional(
        @SuppressWarnings("hiding") PTermoRelacional _termoRelacional_,
        @SuppressWarnings("hiding") PSinalIgualgade _sinalIgualgade_,
        @SuppressWarnings("hiding") PFatorRelacional _fatorRelacional_)
    {
        // Constructor
        setTermoRelacional(_termoRelacional_);

        setSinalIgualgade(_sinalIgualgade_);

        setFatorRelacional(_fatorRelacional_);

    }

    @Override
    public Object clone()
    {
        return new ATermoRelacionalTermoRelacional(
            cloneNode(this._termoRelacional_),
            cloneNode(this._sinalIgualgade_),
            cloneNode(this._fatorRelacional_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATermoRelacionalTermoRelacional(this);
    }

    public PTermoRelacional getTermoRelacional()
    {
        return this._termoRelacional_;
    }

    public void setTermoRelacional(PTermoRelacional node)
    {
        if(this._termoRelacional_ != null)
        {
            this._termoRelacional_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termoRelacional_ = node;
    }

    public PSinalIgualgade getSinalIgualgade()
    {
        return this._sinalIgualgade_;
    }

    public void setSinalIgualgade(PSinalIgualgade node)
    {
        if(this._sinalIgualgade_ != null)
        {
            this._sinalIgualgade_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sinalIgualgade_ = node;
    }

    public PFatorRelacional getFatorRelacional()
    {
        return this._fatorRelacional_;
    }

    public void setFatorRelacional(PFatorRelacional node)
    {
        if(this._fatorRelacional_ != null)
        {
            this._fatorRelacional_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fatorRelacional_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termoRelacional_)
            + toString(this._sinalIgualgade_)
            + toString(this._fatorRelacional_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termoRelacional_ == child)
        {
            this._termoRelacional_ = null;
            return;
        }

        if(this._sinalIgualgade_ == child)
        {
            this._sinalIgualgade_ = null;
            return;
        }

        if(this._fatorRelacional_ == child)
        {
            this._fatorRelacional_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._termoRelacional_ == oldChild)
        {
            setTermoRelacional((PTermoRelacional) newChild);
            return;
        }

        if(this._sinalIgualgade_ == oldChild)
        {
            setSinalIgualgade((PSinalIgualgade) newChild);
            return;
        }

        if(this._fatorRelacional_ == oldChild)
        {
            setFatorRelacional((PFatorRelacional) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}